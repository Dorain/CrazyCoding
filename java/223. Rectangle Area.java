public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // sum - overlap
        int blX = Math.max(A, E), blY = Math.max(B, F);
        int trX = Math.max(blX, Math.min(C, G)), trY = Math.max(blY, Math.min(D, H));
        return (C-A)*(D-B) + (G-E)*(H-F) - (trX-blX)*(trY-blY);
    }
}