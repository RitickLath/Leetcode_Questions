class Solution {
    public String interpret(String command) {
        
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i<command.length() ; i++){
            if(command.charAt(i) == 'G'){
                s.append('G');
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                s.append('o');
                i++;
            }
            else{
                i = i+3;
                s.append("al");
            }
            
        }
        return s.toString();
    }
}