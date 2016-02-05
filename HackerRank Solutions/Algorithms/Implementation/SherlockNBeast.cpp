#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
 int t;
 cin >> t;
 while (t--)
 {
  int n;
  cin >> n;
  int k = -1, p = -1;
  for (int i = n / 3; i >= 0;i--)
      {
          if ((n - 3 * i) % 5 == 0)
          {
            k = i;
            p = (n - 3 * i) / 5;
            break;
          }
      }
  if (k == -1)
   cout << "-1\n";
  else
  {
   for (int i = 0; i < 3*k; i++)
    cout << "5";
   for (int j = 0; j < 5*p; j++)
    cout << "3";
   cout << endl;
  }
 }
    return 0;
}
