package Chatbot;

public class Chatbot {

		private String username;
		private boolean chatting;
		private Topic DanielM;
	public Chatbot() {
		DanielM = new ChatbotDanielM();
		username = "Unknown User";
		chatting = true;
	}
	public void startChatting()
	{
		ChatbotMain.print("Hi! I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatbotMain.getInput();
		while(chatting)
		{
			ChatbotMain.print("What would you like to talk about?");
			String response = ChatbotMain.getInput();
			if(DanielM.isTriggered(response))
			{
				chatting = false;
				DanielM.talk(response);
			}else
			{
				ChatbotMain.print("I'm sorry. I dont understand. I never said I was perfect.");
			}
		}
	}
}
