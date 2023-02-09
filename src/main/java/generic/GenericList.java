package generic;

public class GenericList<T> { //LiostaPrestamos

        private Node<T> firstBook;
        private int size;
        public GenericList(){
            this.firstBook=null;
            this.size=0;
        }
        public int size(){
            return size;
        }
        public Node<T> getFirstBook(){
            return firstBook;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void add(T elem){
            Node<T> node =new Node<>(elem);
            if(isEmpty()){
                firstBook=node;
            }else{
                node.setNext(firstBook);
                firstBook=node;
            }
            size++;

        }

           public int search(T elem){
            int result = -1;
            if(isEmpty()) {
                return result;
            }

                Node node =firstBook;
                for(int i = 0; i<size;i++){
                    if(node.getElem().equals(elem)) {
                        return i;

                    }
                    node=node.getNext();

                }
            return result;

        }

               public T remove(int index){
            T result = null;
            if(isEmpty() || index < 0 || index>=size)
                return result;
            Node node;
            if(index==0){
                result = firstBook.getElem();
                firstBook = firstBook.getNext();
            } else {
                Node<T> aux1 = firstBook;
                Node<T> aux2 = firstBook.getNext();
                while(index>1){
                    aux1 = aux2;
                    aux2 = aux2.getNext();
                    index--;
                }
                result = aux2.getElem();
                aux1.setNext(aux2.getNext());
            }
            size--;
            return result;
        }

        public T get(int index){
            T result = null;
            if (isEmpty() || index <0 || index>=size)
                return result;
            Node<T> node = firstBook;
            while(index>0){
                node = node.getNext();
                index--;
            }
//        for (int i = 0; i <= index; i++) {
//            node = node.getNext();
//        }
            result = node.getElem();
            return result;
        }
    public void clear(){
        firstBook = null;
        size = 0;
    }

    public boolean addAll(GenericList<T> list){
        boolean updated = false;
        Node node = list.getFirstBook() ;
        for (int i = 0; i < list.size(); i++) {
            add((T) node.getElem());
            node = node.getNext();
            updated = true;
        }
        return updated;
    }




//    private class Node{
//        private Books elem;
//        private Node next;
//
//        public Node(){
//            this.next=null;
//        }
//       public Node(Books elem){
//            this.elem=elem;
//            this.next=null;
//        }
//
//       /*
//       public Node(Books elem,Node next){
//            this.elem = elem;
//            this.next = next;
//        }
//
//        */
//
//        public Node getNext() {
//            return next;
//        }
//
//        public Books getElem() {
//            return elem;
//        }
//
//
//        public void setElem(Books elem) {
//            this.elem = elem;
//        }
//
//        public void setNext(Node next) {
//            this.next = next;
//        }
//
//
//    }
//    @Override
//    public boolean equals(Object obj){
//        if(!(obj instanceof GenericList))
//            return false;
//        GenericList list = (GenericList) obj;
//
//        if(list.size() != this.size)
//            return false;
//
//        Node<T> aux1 = this.firstBook;
//        Node<T> aux2 = list.getFirstBook();
//
//        while(aux1 != null){
//            if(!aux1.equals(aux2))
//                return false;
//            aux1 = aux1.getNext();
//            aux2 = aux2.getNext();
//        }
//        return true;
//    }
//    @Override
//    public String toString(){
//        return "{ size: " + size + ", Element: " + ((firstBook==null) ? "}" : firstBook.toString());
//    }
//
//    public boolean contains(T elem){
//        Node<T> node = firstBook ;
//        for (int i = 0; i < size; i++) {
//            if(elem.equals(node.getElem()))
//                return true;
//            node = node.getNext();
//        }
//        return false;
//    }

    }


