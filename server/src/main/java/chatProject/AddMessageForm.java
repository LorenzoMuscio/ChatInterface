package chatProject;

import chatProject.model.user.UserInfo;

/**
 * The content of the form to add a new message.
 * @param <T> the type of messages to use (probably String)
 */
public class AddMessageForm<String> {

    private final int chatroomId;
    private final UserInfo user;
    private final String content;

    public AddMessageForm(int chatroomId, UserInfo user, String content) {
        this.chatroomId = chatroomId;
        this.user = user;
        this.content = content;
    }

    /**
     * Gets the ID of the chatroom where the message was sent
     * @return the chatroom ID
     */
    public int getChatroomId() {
        return chatroomId;
    }

    /**
     * Gets the sender of the message.
     * @return the user who sent the message
     */
    public UserInfo getUser() {
        return user;
    }

    /**
     * Gets the content of the message.
     * @return the message content
     */
    public String getContent() {
        return content;
    }
}