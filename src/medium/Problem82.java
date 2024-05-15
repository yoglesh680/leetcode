package medium;

class ListNode1 {

	int val;
	ListNode1 next;

	ListNode1() {
	}

	ListNode1(int val) {
		this.val = val;
	}

	ListNode1(int val, ListNode1 next) {
		this.val = val;
		this.next = next;
	}
}

public class Problem82 {
	public static ListNode1 deleteDuplicates(ListNode1 head) {
		ListNode1 dummy = new ListNode1(0, head);
		ListNode1 prev = dummy;
		while (head != null) {
			if (head.next != null && head.val == head.next.val) {
				while (head.next != null && head.val == head.next.val) {
					head = head.next;
				}
				prev.next = head.next;
			} else {
				prev = prev.next;
			}
			head = head.next;
		}
		return dummy.next;
	}

	public static void printList(ListNode1 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}

	public static void main(String[] args) {
		ListNode1 head1 = new ListNode1(1);
		head1.next = new ListNode1(2);
		head1.next.next = new ListNode1(3);
		head1.next.next.next = new ListNode1(4);
		head1.next.next.next.next = new ListNode1(4);
		head1.next.next.next.next.next = new ListNode1(5);
		ListNode1 head = deleteDuplicates(head1);
		printList(head);

	}
}
