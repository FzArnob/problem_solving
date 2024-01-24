#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define true 1
#define false 0

void process(char *, int); 

int main(int argc, char **argv)
{
	int k;
	char string[100];
	while (scanf("%s", string) != eof)
	{
		scanf("%d", &k);
		process(string, k);
	}
	return 0;
}

void process(char *str, int n)
{
	int i, ans, cnt;
	i = ans = cnt = 0;
	while (str[i])
	{
		if (str[i] == 'w')
			++ans, ++i;
		else if (str[i] == 'r' && str[i + 1] == 'w')
			++ans, ++i;
		else if (str[i] == 'r' && str[i + 1] == 'r')
		{
			while (str[i] && str[i] == 'r' && cnt < n)
				++cnt, ++i;
			++ans;
			cnt = 0;
		}
		else
			++ans, ++i;
	}
	printf("%d\n", ans);

}