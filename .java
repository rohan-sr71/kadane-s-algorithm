class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    int maxh = 0, maxf = Integer.MIN_VALUE;
		    for(int i=0; i<n; i++){
		        maxh+=arr[i];
		        maxf=Integer.max(maxh,maxf);
		        if(maxh<0)
		            maxh=0;

            }
		    System.out.println(maxf);
		}
	}
}
