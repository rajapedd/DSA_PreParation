import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> childs;

    public TreeNode(String data){
        this.data=data;
        childs=new ArrayList<>();
    }

    public void addChilds(TreeNode node){
        this.childs.add(node);

    }

    public String print(int level){
        String ret;
        ret=" ".repeat(level)+data+"\n";
        for(TreeNode node: this.childs){
            ret+= node.print(level+1);

        }
        return ret;
    }
}
