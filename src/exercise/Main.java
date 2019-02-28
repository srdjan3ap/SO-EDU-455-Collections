package exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	/*
	 * Write a program that prints its arguments in random order. Do not make a copy
	 * of the argument array. Demonstrate how to print out the elements using both
	 * streams and the traditional enhanced for statement.
	 */

	static void printRandom(String[] args) {

		List<String> list = Arrays.asList(args);

		Collections.shuffle(list);

		System.out.println("Printing using traditional enhanced for statement");
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("Printing using Java 8 features");
		list.forEach(System.out::println);

	}

	/*
	 * Take the FindDupsexample and modify it to use a SortedSet instead of a Set.
	 * Specify a Comparator so that case is ignored when sorting and identifying set
	 * elements.
	 */

	static SortedSet<String> findDupsExample(String[] args) {

		SortedSet<String> sortedSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

		Collections.addAll(sortedSet, args);

		return sortedSet;
	}

	/*
	 * Write a method that takes a List<String> and applies String.trim to each
	 * element
	 */

	static List<String> trimListElements(List<String> list) {

		ListIterator<String> it = list.listIterator();

		while (it.hasNext()) {
			it.set(it.next().trim());
		}

		return list;

	}

	/*
	 * Consider the four core interfaces, Set, List, Queue, and Map. For each of the
	 * following four assignments, specify which of the four core interfaces is
	 * best-suited, and explain how to use it to implement the assignment.
	 */

	/*
	 * Whimsical Toys Inc (WTI) needs to record the names of all its employees.
	 * Every month, an employee will be chosen at random from these records to
	 * receive a free toy.
	 */

	// ANSWER: I will use LIST, since i can shuffle it's elements.

	/*
	 * WTI has decided that each new product will be named after an employee — but
	 * only first names will be used, and each name will be used only once. Prepare
	 * a list of unique first names.
	 */

	// ANSWER: I will use SET, because it cannot contain duplicates.

	/*
	 * WTI decides that it only wants to use the most popular names for its toys.
	 * Count up the number of employees who have each first name.
	 */

	// ANSWER: I will use MAP, by mapping each first name (key) to its count
	// (value).

	/*
	 * WTI acquires season tickets for the local lacrosse team, to be shared by
	 * employees. Create a waiting list for this popular sport.
	 */

	// ANSWER: I will use QUEUE, because i can order elements in FIFO order.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
