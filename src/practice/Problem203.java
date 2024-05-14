package practice;

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

public class Problem203 {
	public static ListNode removeElements(ListNode head, int val) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode current = temp;
		while (current.next != null) {
			if (current.next.val == val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return temp.next;
	}

	private void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode half = head;
		ListNode full = head;

		while (full != null && full.next != null) {
			half = full.next;
			full = full.next.next;
		}

		ListNode reverListNode = reverseList(half);

		while (reverListNode != null) {
			if (head.val != reverListNode.val) {
				return false;
			}
			head = head.next;
			reverListNode = reverListNode.next;
		}

		return true;

	}

	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode nextNode;
		while (current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		return prev;
	}

	public static void main(String[] args) {
		int val1 = 6;
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(1);
		head1.next.next = new ListNode(2);
		head1.next.next.next = new ListNode(1);
//		head1.next.next.next.next = new ListNode(3);
//		head1.next.next.next.next.next = new ListNode(2);
//		head1.next.next.next.next.next.next = new ListNode(6);
//		ListNode result2 = removeElements(head1, val1);

//		ListNode result2 = reverseList(head1);
		boolean result2 = isPalindrome(head1);
		System.out.println(result2);
//		printLinkedList(result2); // Output: []

	}

}
