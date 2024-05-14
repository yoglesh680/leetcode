package leetCode;

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

public class Problem21 {
	private static void printLinkedList(ListNode1 head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
		ListNode1 dummy = new ListNode1(0);
		ListNode1 current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
//		int val1 = 6;
		ListNode1 head1 = new ListNode1(1);
		head1.next = new ListNode1(2);
		head1.next.next = new ListNode1(4);
		ListNode1 head2 = new ListNode1(1);
		head2.next = new ListNode1(3);
		head2.next.next = new ListNode1(4);
//				head1.next.next.next = new ListNode(1);
//				head1.next.next.next.next = new ListNode(3);
//				head1.next.next.next.next.next = new ListNode(2);
//				head1.next.next.next.next.next.next = new ListNode(6);
		ListNode1 delete = mergeTwoLists(head1, head2);
		printLinkedList(delete);

	}
}
