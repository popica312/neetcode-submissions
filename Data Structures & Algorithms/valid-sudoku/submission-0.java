class Solution {
    // Solution 1 - intuitive: Check individually for all rules
    // 1. Check for rows not containing duplicates = O(n^2) time, but O(n) space
    // 2. Same for columns
    // 3. Check for each 3x3 box 

    // if number is sudoku valid, then return true
    boolean inRange(int num)
    {
        return (num >= 1 && num <= 9);
    }

    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        boolean[] freq = new boolean[10]; // freq array for numbers, skip 0 for ease of use;
        
        // check rows
        boolean rule = true;
        for (int i = 0; i < n && rule; i++)
        {
            // reset freq before use
            for (int j = 1; j <= n; j++)
                freq[j] = false; // not found
            for (int j = 0; j < n; j++)
            {
                int num = board[i][j] - '0';
                if (inRange(num))
                {
                    if (freq[num])
                    {
                        rule = false;
                        break;
                    }
                    freq[num] = true;
                }
            }
        }
        
        if (!rule)
            return false;
        // else continue
        
        // check the columns;
        for (int j = 0; j < n && rule; j++)
        {
            // reset freq
            for (int i = 1; i <= n; i++)
                freq[i] = false;
            
            for (int i = 0; i < n; i ++)
            {
                int num = board[i][j] - '0';
                if (inRange(num))
                {
                    if (freq[num])
                    {
                        rule = false;
                        break;
                    }
                    freq[num] = true;
                }
            }
        }

        if (!rule)
            return false;

        // 3x3 box
        for (int di = 0; di < 3 && rule; di++)
        {
            for (int dj = 0; dj < 3 && rule; dj++)
            {
                // reset freq
                for (int j = 1; j <= 9; j++)
                    freq[j] = false;
                
                // for each box section, now check every 3x3 box
                for (int i = 0; i < 3 && rule; i++)
                {
                    // actual check
                    for (int j = 0; j < 3; j++)
                    {
                        int num = board[3*di+i][3*dj+j] - '0';
                        if (inRange(num))
                        {
                            if (freq[num])
                            {
                                rule = false;
                                break;
                            }
                            freq[num] = true;
                        }
                    }
                }
            }
        }

        // whatever the value, we return it
        return rule;
    }
}
