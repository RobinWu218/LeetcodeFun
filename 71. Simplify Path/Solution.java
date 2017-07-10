public class Solution {
    public String simplifyPath(String path) {
        if (path == "")return null;
        Deque<String> pathNames = new LinkedList<>();
        if (path.charAt(0) == '/'){
            pathNames.addFirst("/");
        }
        for (String s: path.split("/")){
            if (s.equals("..")){
                if (pathNames.isEmpty() || pathNames.peekFirst() == s){
                    pathNames.addFirst(s);
                }else if(!pathNames.peekFirst().equals("/")){
                    pathNames.removeFirst();
                }
            }else if (!s.equals(".") && !s.isEmpty()){
                pathNames.addFirst(s);
            }
        }
        
        StringBuilder result = new StringBuilder();
        if (!pathNames.isEmpty()){
            Iterator<String> iter = pathNames.descendingIterator();
            String cur = iter.next();
            result.append(cur);
            while (iter.hasNext()){
                if (cur != "/"){
                    result.append("/");
                }
                cur = iter.next();
                result.append(cur);                  
            }
        }
        return result.toString();
        
    }
}