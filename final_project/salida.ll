; ModuleID = "scheduler"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %".2" = bitcast [30 x i8]* @"fmt_header" to i8*
  %".3" = call i32 (i8*, ...) @"printf"(i8* %".2")
  %".4" = bitcast [54 x i8]* @"fmt_row" to i8*
  %".5" = bitcast [2 x i8]* @"name_A" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".4", i32 1, i8* %".5", i32 3, i32 0, i32 0)
  %".7" = bitcast [2 x i8]* @"name_D" to i8*
  %".8" = call i32 (i8*, ...) @"printf"(i8* %".4", i32 2, i8* %".7", i32 6, i32 0, i32 0)
  %".9" = bitcast [2 x i8]* @"name_B" to i8*
  %".10" = call i32 (i8*, ...) @"printf"(i8* %".4", i32 3, i8* %".9", i32 8, i32 2, i32 20)
  %".11" = bitcast [2 x i8]* @"name_C" to i8*
  %".12" = call i32 (i8*, ...) @"printf"(i8* %".4", i32 4, i8* %".11", i32 13, i32 4, i32 100)
  %".13" = bitcast [25 x i8]* @"fmt_total" to i8*
  %"p_A" = add i32 0, 0
  %"p_D" = add i32 %"p_A", 0
  %"p_B" = add i32 %"p_D", 20
  %"p_C" = add i32 %"p_B", 100
  %".14" = call i32 (i8*, ...) @"printf"(i8* %".13", i32 %"p_C")
  ret i32 0
}

@"fmt_header" = internal constant [30 x i8] c"Secuencia optima de ordenes:\0a\00"
@"fmt_row" = internal constant [54 x i8] c"Paso %d: Orden %s | finish=%d | late=%d | penalty=%d\0a\00"
@"name_A" = internal constant [2 x i8] c"A\00"
@"name_D" = internal constant [2 x i8] c"D\00"
@"name_B" = internal constant [2 x i8] c"B\00"
@"name_C" = internal constant [2 x i8] c"C\00"
@"fmt_total" = internal constant [25 x i8] c"\0aPenalizacion total: %d\0a\00"