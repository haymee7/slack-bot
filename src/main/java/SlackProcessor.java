import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class SlackProcessor {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello");
    Slack slack = Slack.getInstance();

    String token = "";
    MethodsClient methods = slack.methods(token);

    ChatPostMessageRequest request = ChatPostMessageRequest.builder()
      .channel("#log-prod")
      .text("hi")
      .build();

    ChatPostMessageResponse response = methods.chatPostMessage(request);
    System.out.println(response);
  }
}
