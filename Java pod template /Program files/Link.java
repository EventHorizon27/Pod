public class Link {
  int a;
  int b;
  boolean is2way;
  public Link() {
    a=0;
    b=0;
  }




  public void setR(int q, int z, boolean x) {
    a=q;
    b=z;
    is2way=x;
  }

  public void read(int q, int z, boolean x) {
    q=a;
    b=z;
    x=is2way;
  }
}
