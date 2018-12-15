import 'dart:io';
import 'dart:async';
import 'dart:math';

void main() async {
  await I()..willBe()..ooo()..for_(minutes: 5);
}

class I {
  void willBe() { /* pass */ }

  void ooo() {
    stdout.write("ooo ");
  }

  Future<void> for_({int minutes}) async {
    Future.any([
      Future.value(_someMethod(minutes)),
      Future.value(_someMethod(minutes)),
      Future.value(_someMethod(minutes))
    ]).asStream().listen((min) {
      print('$min min');
    });
  }

  Future<int> _someMethod(int value) async {
    final Stream<int> stream = Stream.fromIterable(Iterable.generate(50000, (i) => Random().nextInt(value + 1)));
    await for (var i in stream) {
      if(value == i)
        return i;
    }
    return value;
  }
}