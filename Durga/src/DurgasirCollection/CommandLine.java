package DurgasirCollection;

	class AccountCommandLine {
		String name;
		double bal;
		AccountCommandLine(String n, double b) {
		name = n;
		bal = b;
		}
		void show() {
		if(bal>0)
		System.out.print("--> ");
		System.out.println(name + ": $" + bal);
		}
		}
		class CommandLine {
		public static void main(String args[]) {
		AccountCommandLine current[] = new AccountCommandLine[3];
		current[0] = new AccountCommandLine("K. J. Fielding", 123.23);
		current[1] = new AccountCommandLine("Will Tell", 157.02);
		current[2] = new AccountCommandLine("Tom Jackson", -12.33);
		for(int i=0; i<3; i++) current[i].show();
		}
		}