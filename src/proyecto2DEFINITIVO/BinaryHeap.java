/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2DEFINITIVO;


public class BinaryHeap {
    public Document[] binHeap;
    public int registered;
    private int size;

    /**
     * Constructor
     */
    public BinaryHeap() {
        this.size = 500;
        this.registered = 0;
        this.binHeap = new Document[size];
    }

    /**
     * 
     * @param title
     * @param size
     * @param type
     * @param timeLabel 
     * 
     */
public void insert(String title, int size, String type, int timeLabel) {
    Document doc = new Document(title,size,type, timeLabel);
    if (registered == size) {
        throw new IllegalStateException("El montículo está lleno");
    }else{
        registered++;
        int currentIndex = registered - 1;
        binHeap[currentIndex] = doc;

        while (currentIndex != 0 && binHeap[parentIndex(currentIndex)].time > binHeap[currentIndex].time) {
            swap(currentIndex, parentIndex(currentIndex));
            currentIndex = parentIndex(currentIndex);
        }}
}

/**
 * 
 * @param index 
 */
private void heapify(int index) {
    int smallest = index;
    int leftChild = leftChildIndex(index);
    int rightChild = rightChildIndex(index);

    if (leftChild < registered && binHeap[leftChild].time < binHeap[smallest].time) {
        smallest = leftChild;
    }

    if (rightChild < registered && binHeap[rightChild].time < binHeap[smallest].time) {
        smallest = rightChild;
    }

    if (smallest != index) {
        swap(index, smallest);
        heapify(smallest);
    }
}

/**
 * 
 * @param index
 * @return 
 */
private int parentIndex(int index) {
    return (index - 1) / 2;
}

/**
 * 
 * @param index
 * @return 
 */
public int leftChildIndex(int index) {
    return (2 * index) + 1;
}

/**
 * 
 * @param index
 * @return 
 */
public int rightChildIndex(int index) {
    return (2 * index) + 2;
}

/**
 * 
 * @param index1
 * @param index2 
 */
private void swap(int index1, int index2) {
    Document temp = binHeap[index1];
    binHeap[index1] = binHeap[index2];
    binHeap[index2] = temp;
}

/**
 * 
 * @return 
 */
public Document deleteMin() {
    if (registered == 0) {
        return null;
    }else if (registered == 1) {
        registered--;
        return binHeap[0];
    }else{
        Document root = binHeap[0];
        binHeap[0] = binHeap[registered - 1];
        registered--;
        heapify(0);

        return root;}
}

/**
 * 
 * @param doc 
 */
public void deleteDocument(Document doc){
    if(this.binHeap[0].time == doc.time && this.binHeap[0].title.equals(doc.title)){
        this.deleteMin();
    }else{
        if(this.binHeap[0]!= null){
        Document aux = this.deleteMin();
        this.deleteDocument(doc);
        this.insert(aux.title, aux.size,aux.type, aux.time);
        }
        
    }
}

/**
 * 
 * @param binHeapStr
 * @return 
 */
public String print(String binHeapStr){
    Document aux = this.deleteMin();
    if(aux!= null){
        binHeapStr += "Documento: " + aux.title + "\n";
        binHeapStr = print(binHeapStr);
        this.insert(aux.title, aux.size,aux.type, aux.time);
    }
    return binHeapStr;
}

}


