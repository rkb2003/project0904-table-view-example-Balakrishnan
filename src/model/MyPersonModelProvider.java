package model;

import java.util.ArrayList;

import java.util.List;

import util.UtilFile;


public enum MyPersonModelProvider {
	

	
		INSTANCE(getFilePath()); // Call a constructor with a parameter. 

		private List<MyPerson> persons;

	        // Load hard-coded data sets. 
		private MyPersonModelProvider() {
			persons = new ArrayList<MyPerson>();
			persons.add(new MyPerson("FirstNameA", "LastNameA", "Address1"));
			persons.add(new MyPerson("FirstNameB", "LastNameB", "Address2"));
			persons.add(new MyPerson("FirstNameC", "LastNameC", "Address3"));
		}

	        // Load the data sets from a file dynamically. 
		private MyPersonModelProvider(String inputdata) {
			List<String> contents = UtilFile.readFile(inputdata);
			List<List<String>> tableContents = UtilFile.convertTableContents(contents);

			persons = new ArrayList<MyPerson>();
			for (List<String> iList : tableContents) {
				persons.add(new MyPerson(iList.get(0), iList.get(1), iList.get(2)));
			}
		}

		private static String getFilePath() {
			return "C:/Users/Rajasree/eclipse-workspace/project0904-table-view-example-Balakrishnan/src/input.txt";
		}

		public List<MyPerson> getPersons() {
			return persons;
		}
	}
	
	
	
	
	
	
	
 /*  INSTANCE;

   private List<MyPerson> persons;

   private MyPersonModelProvider() {
      persons = new ArrayList<MyPerson>();
      persons.add(new MyPerson("FirstNameA", "LastNameA", "100 , 101 street, Omaha"));
      persons.add(new MyPerson("FirstNameB", "LastNameB", "200 201 Street, Omaha, Ne"));
      persons.add(new MyPerson("FirstNameC", "LastNameC", "300 201 Street, Omaha, Ne"));
      persons.add(new MyPerson("FirstNameD", "LastNameD", "400 201 Street, Omaha, Ne"));
      persons.add(new MyPerson("FirstNameE", "LastNameE", "500 201 Street, Omaha, Ne"));
   }

   public List<MyPerson> getPersons() {
      return persons;
   }*/

