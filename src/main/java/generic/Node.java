package generic;

class Node<T> {
    private T elem;
    private Node<T> next;

    public Node(T elem){
        this.elem=elem;
        this.next=null;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return elem + ((next!=null)?", " + next : " }");
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Node))
            return false;
        Node<T> node = (Node) obj;
        return (node.getElem() == elem);
    }
}
