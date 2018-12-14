public class OutOfOffice {

	public static void main(String[] args) {
		String[] sentencePart1 = { "A neighbor called you and said that ",
				"Your sister became ill and urgently needed her ",
				"You have broken off a piece of tooth and you urgently need ",
				"You were bitten last night by a bee, and " };
		String[] sentencePart2 = { "the face is swollen so that you can not even drive the car.",
				"You broke the pipe and you drown it. Run home as soon as possible!", "to the dentist.",
				"take to the hospital." };
		String[] sentencePart3 = { "Let me go for 5 minutes.", "Let me go for 1 year", "Let me go for 1 seconds.",
				"Let me go 595421 days." };
		
		System.out.println(sentencePart1[(int) (Math.random() * 4)] + sentencePart2[(int) (Math.random() * 4)]
				+ sentencePart3[(int) (Math.random() * 4)]);
	}
}
