@RestController
public class UIController {
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView viewHome = new ModelAndView("Home");
		return viewHome;
	}

	@RequestMapping("/chatroom")
	public ModelAndView chatroom() {
		ModelAndView viewChatroom = new ModelAndView("Chatroom");
		return viewChatroom;
	}

	@RequestMapping("/userlist")
	public ModelAndView userList() {
		ModelAndView viewUserList = new ModelAndView("UserList");
		return viewUserList;
	}
}