import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {
	@RequestMapping("/")
	public ModelAndView index() {
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