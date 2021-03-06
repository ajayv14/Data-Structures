class LongestCommonSubsequence {
	
	//dp - runtime complexity O(M X N), Space - O(M X N)
		

		public int longestCommonSubsequence(String text1, String text2) {
        
        if(text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0) return 0;
        
        
        int[][] dp = new int[text1.length() + 1][text2.length() + 1]; // + 1 to account for empty string "" 
        
        
        //fill first row and col with 0s as we have empty string in 2D matrix at beginning
        
        for(int i = 0; i < text1.length() + 1; i++){
            dp[i][0] = 0;           
        }
        
        for(int j = 0; j < text2.length() + 1; j++){
            dp[0][j] = 0;
        }
        
        //max of top and left or max of top and (left +1) -- in case of a match
                
        for(int i = 1; i < text1.length() + 1; i++){
            
            for(int j = 1; j < text2.length() + 1; j++){
                
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){ // here we take i - 1, j - 1 as string index starts from 0
                    
                  dp[i][j] = dp[i - 1][j - 1] + 1;      
                }
                
                else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }                 
            }             
        }
        
       /* 
         for(int i = 0; i < text1.length() + 1; i++){
            
            for(int j = 0; j < text2.length() + 1; j++){
                
                System.out.print(dp[i][j] + " ");
                
            }            
             System.out.print(" ");
            
        }
*/        
        return dp[text1.length()][text2.length()];
    }
}

	




}