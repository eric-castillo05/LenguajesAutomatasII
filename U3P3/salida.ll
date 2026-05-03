; ModuleID = "llvm"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"atoi"(i8* %".1")

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"(i32 %".1", i8** %".2")
{
entry:
  %"ptr_x" = getelementptr i8*, i8** %".2", i32 1
  %"str_x" = load i8*, i8** %"ptr_x"
  %"int_x" = call i32 @"atoi"(i8* %"str_x")
  %"x" = alloca i32
  store i32 %"int_x", i32* %"x"
  %"load_x" = load i32, i32* %"x"
  %"ptr_d" = getelementptr i8*, i8** %".2", i32 2
  %"str_d" = load i8*, i8** %"ptr_d"
  %"int_d" = call i32 @"atoi"(i8* %"str_d")
  %"d" = alloca i32
  store i32 %"int_d", i32* %"d"
  %"load_d" = load i32, i32* %"d"
  %"t0" = mul i32 %"load_x", %"load_d"
  %".6" = bitcast [4 x i8]* @"fmt" to i8*
  %".7" = call i32 (i8*, ...) @"printf"(i8* %".6", i32 %"t0")
  ret i32 %"t0"
}

@"fmt" = internal constant [4 x i8] c"%d\0a\00"