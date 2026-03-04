import java.util.Stack;

class BrowserHistory {

    private Stack<String> back;
    private Stack<String> forward;
    private String currentPage;

    public BrowserHistory(String homepage) {
        back = new Stack<>();
        forward = new Stack<>();
        currentPage = homepage ;
    }

    public void visit(String url) {
        back.push(currentPage);
        currentPage = url;
        forward.clear();
        
    }

    public String back(int steps) {
        while (steps > 0 && !back.isEmpty()) {
            forward.push(currentPage);
            currentPage = back.pop();
            steps--;
        }
        return currentPage;
    }

    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            back.push(currentPage);
            currentPage = forward.pop();
            steps--;
        }
        return currentPage;
    }
}