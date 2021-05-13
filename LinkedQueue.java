
public class LinkedQueue<T> implements Queue<T>{

	LinkedNode<T> head;
	LinkedNode<T> tail;
	int size = 0;
	
	@Override
	public void enqueue(T item) {   //O(1)
		//Head == null / size == 0
		if (head == null){
			head = new LinkedNode<T>(item);
			tail = head;
			size = 1;
		}
		//size >= 1
		else if (size >= 1){
			LinkedNode<T> temp = new LinkedNode<T>(item);
			temp.setNext(head);
			head = temp;
			size++;
		}
	}

	@Override
	public T dequeue() {			//O(n)
		try{
			if (size == 1){ //(head == tail)  //The linked list is size 1
				T temp = tail.getElement();
				head = null;
				tail = null;
				size = 0;
				return temp;
			}
			else{							  //The linked list is size > 1
				T temp = tail.getElement();
				LinkedNode<T> tempNode = head;
				while (tempNode.getNext() != tail){
					tempNode = tempNode.getNext();
				}
				tail = tempNode;
				tail.setNext(null);
				size--;
				return temp;
			}
		}
		catch (NullPointerException e){
			return null;	//The linked list is empty
		}
	}

	@Override
	public T peek() {		//O(1)
		try{
			return tail.getElement();
		}
		catch (NullPointerException e){
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;   //head == null   O(1)
	}

	@Override
	public int size() {		//O(1)
		return size;
	}

}
