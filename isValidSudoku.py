def isValidSudoku(board):
    def isRowValid(board, row):
        st = set()
        for i in range(len(board[row])):
            if board[row][i] == ".":
                continue
            
            if board[row][i] not in st:
                st.add(board[row][i])
                
            elif board[row][i] in st:
                return False
        
        return True
        
    def isColValid(board, col):
        st = set()
        for i in range(len(board)):
            if board[i][col] == ".":
                continue
            
            if board[i][col] not in st:
                st.add(board[i][col])
                
            elif board[i][col] in st:
                return False
                
        return True
    
    def isBoxValid(board, startRow, startCol):
        st = set()
        for row in range(3):
            for col in range(3):
                if board[row + startRow][col + startCol] == ".":
                    continue
                
                if board[row + startRow][col + startCol] not in st:
                    st.add(board[row + startRow][col + startCol])
                elif board[row + startRow][col + startCol] in st:
                    return False
        return True
     
    for row in range(9):
        if not isRowValid(board, row):
            return False
    
    for col in range(9):
        if not isColValid(board, col):
            return False
    
    for row in range(0,9,3):
        for col in range(0,9,3):
            if not isBoxValid(board, row, col):
                return False
    
    return True
    
                    
            
 
  
        
        

