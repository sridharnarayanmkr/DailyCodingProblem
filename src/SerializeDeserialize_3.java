import java.util.Collections;

public class SerializeDeserialize_3 {

    static class Node{
        String val;
        Node left,right;
        public Node(){
            val="";
            left=right=null;
        }
        public Node(String val){
            this.val=val;
            left=right=null;
        }
        public Node(String val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public Node(String val, Node left){
            this(val,left,null);
        }

        public Node getLeft()
        {
            return this.left;
        }
        public Node getRight(){
            return this.right;
        }
        public String getVal()
        {
            return this.val;
        }

        public String serializeMethod(){

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Node(");

            if(val==null){
                stringBuilder.append("null");
            }else{
                stringBuilder.append("\'"+val+"\'");
            }

            if(left==null){
                stringBuilder.append(",null");
            }else{
                stringBuilder.append(","+left.serializeMethod());
            }

            if(right==null){
                stringBuilder.append(",null");
            }else{
                stringBuilder.append(","+right.serializeMethod());
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }
    public static void main(String[] args){

        Node node = new Node("test", null, new Node("right", null, null));
        System.out.println(node.serializeMethod());
    }
}
