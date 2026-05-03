; ModuleID = "llvm"
target triple = "unknown-unknown-unknown"
target datalayout = ""

define i32 @"main"()
{
entry:
  %"t0" = mul i32 97, 98
  %"t1" = add i32 %"t0", 99
  %"t2" = sdiv i32 %"t1", 121
  %"t3" = add i32 104, 105
  %"t4" = mul i32 %"t2", %"t3"
  ret i32 %"t4"
}
