public class Solution {
    public String reverseWords(String s) {
        String[] ans=s.split(" ");
    List<String> zoom = new ArrayList<>();
    for(int i=ans.length-1;i>=0;i--)
    {
        if(!ans[i].isEmpty())
        zoom.add(ans[i]);
    }
    String listString = "";
    for (String kk : zoom)
    {
        listString += kk+" ";
    }
    return listString.trim();
    }
}