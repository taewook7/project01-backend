@Controller
public class HelloWorldController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("pls", "The End");
        return "hello테스트중";
    }

}