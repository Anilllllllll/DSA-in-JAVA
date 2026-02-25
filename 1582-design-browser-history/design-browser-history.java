class BrowserHistory {

    ArrayList<String> history;
    int current;
    public BrowserHistory(String homepage) {
        
        history = new ArrayList<>();
        history.add(homepage);
        current =0;

    }
    
    public void visit(String url) {
        while(history.size()>current+1){
            history.remove(history.size()-1);
        }
        history.add(url);
        current++;

    }
    
    public String back(int steps) {
        current = Math.max(0,current-steps);
        return history.get(current);
    }
    
    public String forward(int steps) {
        current = Math.min(history.size()-1,current+steps);
        return history.get(current);

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */