import rx.Single

import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    val initial = for (_ <- 1 to 500) yield Random.between(1, 120)
    val (start, end) = if (initial.head > initial.last) (initial.head, initial.last) else (initial.head, initial.last)
    val randomValues = (start :: initial.toList.reduce((x, y) => x + y * 2) :: (List.range(start, end) ::: initial.reverse.toList)) :+ end
    Single.fromCallable(() => randomValues.random)
      .doOnSubscribe(() => print("ooo "))
      .doOnUnsubscribe(() => print(" min"))
      .subscribe(value => print(value))
  }

  implicit class RandomIntBetween(random: Random) {
    def between(start: Int, end: Int): Int = new Random().nextInt((end - start) + 1) + start
  }

  implicit class RandomListElement[T](list: List[T]) {
    def random: T = Random.shuffle(list).head
  }
}

