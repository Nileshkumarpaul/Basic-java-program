#include<stdio.h>
int main(void) {
  int n, val = 2;
  printf("/n Enter integer ");
  scanf("%d", &n);

  while (val < n / 2) {
    if (n % val == 0) {
      printf("Not prime");
      break;
    }
    val++;
  }
  printf("prime");
}