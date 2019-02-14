package com.personal.FindCheese;

public class CheeseFinder {
    static boolean t=true;
    public static boolean go(int space[][],int currentX,int currentY,int limitX,int limitY)
    {
        //5 means visited
        //9 means cheese
        //0 means no movement possible
        // 1 means u can move 1 step
        boolean found=false;
        if(t==true){
            if(currentX>=0&&currentX<=limitX&&currentY>=0&&currentY<=limitY){
                if(space[currentX][currentY]==1) {
                    space[currentX][currentY] = 5;
                    go(space, currentX + 1, currentY, limitX, limitY);
                    go(space, currentX, currentY + 1, limitX, limitY);
                    go(space, currentX - 1, currentY, limitX, limitY);
                    go(space, currentX, currentY - 1, limitX, limitY);
                }
                else if(space[currentX][currentY]==5||space[currentX][currentY]==0){
                    return false;
                }
                else if(space[currentX][currentY]==9){
                    found =true;
                    System.out.println("Cheese found at["+currentX+","+currentY+"] position");
                }
            }
        }
        if(found==true)
        return true;
        else
            return false;
    }
}
