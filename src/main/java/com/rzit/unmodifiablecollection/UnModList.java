package com.rzit.unmodifiablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ranjith on 6/21/2017.
 */
public class UnModList {

	public static void main(String[] args) {
		List<String> originalList = new ArrayList<String>();
		originalList.add("Ranjith");
		originalList.add("Samatha");
		originalList.add("AkiraNandan");
		List<String> unModList = Collections.unmodifiableList(originalList);
		System.out.println("Before change in original :" + originalList + "\t unModList" + unModList);
		originalList.add("Aradhya");
		System.out.println("After change in original :" + originalList + "\t unModList" + unModList);

		/* If try to change the unModList we will get the exception */
		try {
			unModList.add("NotAdded");
		} catch (UnsupportedOperationException e) {
			System.out.println("Exception :" + e.getClass());
			// e.printStackTrace();
		}

		System.out.println("After change in unModList :" + originalList + "\t unModList" + unModList);

		/* Not reflect to changes in original to unmodList */
		List<String> original = new ArrayList<String>();
		original.add("Ranjith");
		original.add("Samatha");
		original.add("AkiraNandan");
		List<String> unMod = Collections.unmodifiableList(new ArrayList<String>(original));
		System.out.println("Before change in original :" + original + "\t unModList" + unMod);
		original.add("Aradhya");
		System.out.println("After change in original :" + original + "\t unModList" + unMod);

		/* If try to change the unModList we will get the exception */
		try {
			unMod.add("NotAdded");
		} catch (UnsupportedOperationException e) {
			System.out.println("Exception :" + e.getClass());
			// e.printStackTrace();
		}

		System.out.println("After change in unMod :" + original + "\t unModList" + unMod);
	}
}
