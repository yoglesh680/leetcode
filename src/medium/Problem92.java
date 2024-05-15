package medium;

class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Problem92 {
	public static ListNode reverseBetween(ListNode head, int left, int right) {
		if (head.next == null) {
			return head;
		}
//		Input: head = [1,2,3,4,5], left = 2, right = 4
//				Output: [1,4,3,2,5]
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode prev = temp;
		for (int i = 0; i < left - 1; i++) {
			prev = prev.next;
		}
		ListNode current = prev.next;
		ListNode next;
		for (int i = 0; i < right - left; i++) {
			next = current.next;
			current.next = next.next;
			next.next = prev.next;
			prev.next = next;
		}
		return temp.next;

	}

	private static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
		ListNode add = reverseBetween(head1, 2, 4);
		printLinkedList(add);
	}
}
