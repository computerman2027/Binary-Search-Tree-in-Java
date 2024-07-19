
public class Binarytree
{
    Node root;
    Binarytree()
    {
        root=null;
    }
    void insert(int d)
    {
        Node n = new Node(d);
        if(root==null)
        {
            root=n;
        }
        else
        {
            Node curr=root;
            while(curr!=null)
            {
                if(d<curr.data)
                {
                    if(curr.left==null)
                    {
                        curr.left=n;
                        return;
                    }
                    else
                    {
                        curr=curr.left;
                    }
                }
                else
                {
                    if(curr.right==null)
                    {
                        curr.right=n;
                        return;
                    }
                    else
                    {
                        curr=curr.right;
                    }
                }
            }
        }
    }
    void postorder(Node temp)
    {
        if(temp!=null)
        {
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data +", ");
        }
    }
    void preorder(Node temp)
    {
        if(temp!=null)
        {
            System.out.print(temp.data +", ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    void inorder(Node temp)
    {
        if(temp!=null)
        {
            inorder(temp.left);
            System.out.print(temp.data +", ");
            inorder(temp.right);
        }
    }
    Node deleteNode(Node r,int d)
    {
        if(r==null)
        return r;
        if(d<r.data)
        {
            r.left=deleteNode(r.left,d);
        }
        else if(d>r.data)
        {
            r.right=deleteNode(r.right,d);
        }
        else
        {
            if(r.left==null)
            return r.right;
            else if(r.right==null)
            return r.left;
            else
            {
                r.data=(minvalue(r.right)).data;
                r.right=deleteNode(r.right,r.data);
            }
        }
        return r;
    }
    Node minvalue(Node r)
    {
        if(r.left==null)
        {
            return r;
        }
        else
        {
            return minvalue(r.left);
        }
    }
    Node maxvalue(Node r)
    {
        if(r.right==null)
        {
            return r;
        }
        else
        {
            return maxvalue(r.right);
        }
    }
    void find(int d)
    {
        if(root==null)
        {
            System.out.println("Tree doesnot exist");
            return;
        }
        else
        {
            Node temp=root;
            while(temp!=null)
            {
                if(d==temp.data)
                {
                    System.out.println("Data found");
                    return;
                }
                else if(d<temp.data)
                {
                    temp=temp.left;
                }
                else if(d>temp.data)
                {
                    temp=temp.right;
                }
            }
            System.out.println("VALUE DOESNOT EXIST");
        }
    }
}
