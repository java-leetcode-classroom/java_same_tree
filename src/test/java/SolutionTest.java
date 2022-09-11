import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void isSameTreeExample1() {
    assertTrue(sol.isSameTree(sol.createBinaryTree(new String[]{"1","2", "3"}),
        sol.createBinaryTree(new String[]{"1","2","3"})));
  }
  @Test
  void isSameTreeExample2() {
    assertFalse(sol.isSameTree(sol.createBinaryTree(new String[]{"1","2"}),
        sol.createBinaryTree(new String[]{"1","null","2"})));
  }
  @Test
  void isSameTreeExample3() {
    assertFalse(sol.isSameTree(sol.createBinaryTree(new String[]{"1","2","1"}),
        sol.createBinaryTree(new String[]{"1","1","2"})));
  }
}