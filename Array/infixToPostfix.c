#include <stdio.h>
#include <string.h>
#include <ctype.h>
char stack[20];
int top = -1;

void push(char x){
    stack[++top] = x;
}

char pop(){
    if(top == -1)
        return -1;
    else
        return stack[top--];
}

int prio(char x){
    if(x == '(' || x == ')'){
        return 0;
    }
    else if(x == '+' || x == '-'){
        return 1;
    }
    else if(x == '/' || x == '*'){
        return 2;
    }
    else if(x == '^'){
        return 3;
    }
    return -1;
}

int main()
{
    char exp[20];
    char *e,x;
    printf("\nEnter an expression:");
    fgets(exp, sizeof(exp), stdin);
    exp[strcspn(exp, "\n")] = '\0';
    e = exp;
    
    while(*e != '\0'){
        if(isalnum(*e)){
            printf("%c",*e);
        }
        else if(*e == '('){
            push(*e);
        }
        else if(*e == ')'){
            while((x = pop()) != '('){
                printf("%c", x);
            }
        }
        else{
            while(prio(stack[top]) >= prio(*e) && top != -1){
                printf("%c", pop());
            }
            push(*e);
        }
        e++;
    }
    while(top != -1){
        printf("%c",pop());
    }
    
    return 0;
}
