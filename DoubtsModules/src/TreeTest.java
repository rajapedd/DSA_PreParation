public class TreeTest {
    public static void main(String[] args) {
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode hot=new TreeNode("Hot");
        TreeNode cold=new TreeNode("Cold");
        TreeNode tea=new TreeNode("Tea");
        TreeNode coffee=new TreeNode("Coffee");
        TreeNode wine=new TreeNode("Wine");
        TreeNode beer=new TreeNode("Beer");

        drinks.addChilds(hot);
        drinks.addChilds(cold);
        hot.addChilds(tea);
        hot.addChilds(coffee);
        cold.addChilds(wine);
        cold.addChilds(beer);

        System.out.println(drinks.print(0));


    }
}
