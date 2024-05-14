package leetCode;

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

public class Problem83 {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;

	}

	private static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = null;
		ListNode prev = null;
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		while (list1 != null && list2 != null) {
			if (head == null) {
				if (list1.val < list2.val) {
					prev = head = list1;
					list1 = list1.next;
				} else {
					prev = head = list2;
					list2 = list2.next;
				}
				continue;
			}
			if (list1.val < list2.val) {
				prev.next = list1;
				prev = list1;
				list1 = list1.next;
			} else {
				prev.next = list2;
				prev = list2;
				list2 = list2.next;
			}
		}
		if (list1 != null) {
			prev.next = list1;

		} else {
			prev.next = list2;
		}
		return prev;

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode current = temp;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			current.next = new ListNode(sum % 10);
			current = current.next;
			carry = sum / 10;

		}

		return temp.next;

	}

	public static ListNode swapPairs(ListNode head) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;

		while (prev.next != null && prev.next.next != null) {
			ListNode first = prev.next;
			ListNode second = prev.next.next;
			first.next = second.next;
			second.next = first;
			prev.next = second;

			prev = first;

		}
		return dummy.next;

	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return head;
		}
		ListNode temp = head;
		ListNode first = head;
		int j = 0;
		int n = getSize(head);
		int loop = k % n;
		loop = n - loop;
		if (n == 1 || loop == n) {
			return head;
		}
		while (temp != null) {
			j++;
			if (j == loop) {
				first = temp.next;
				temp.next = null;
				break;
			}
			temp = temp.next;
		}
		temp = first;
		if (temp != null) {
			temp = temp.next;
		}
		temp.next = head;
		return first;

	}

	public static int getSize(ListNode temp) {
		int n = 0;
		while (temp != null) {
			n++;
			temp = temp.next;
		}
		return n;
	}

	public static void main(String[] args) {
		int val1 = 2;
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
//		ListNode head2 = new ListNode(5);
//		head2.next = new ListNode(6);
//		head2.next.next = new ListNode(4);
//		head1.next.next.next = new ListNode(1);
//		head1.next.next.next.next = new ListNode(3);
//		head1.next.next.next.next.next = new ListNode(2);
//		head1.next.next.next.next.next.next = new ListNode(6);
//		printLinkedList(head1);
		ListNode add = rotateRight(head1, val1);
		printLinkedList(add);
	}
}
