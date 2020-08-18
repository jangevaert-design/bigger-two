public class biggerTwo {
  public int[] biggerTwo(int[] a, int[] b) {
    int c = a[0] + a[1];
    int d = b[0] + b[1];

    if (c >= d) {
      return a;
    }
    return b;
  }
}
