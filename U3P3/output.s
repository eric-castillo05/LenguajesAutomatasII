	.file	"<string>"
	.text
	.globl	main
	.p2align	4
	.type	main,@function
main:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	pushq	%rbx
	.cfi_def_cfa_offset 24
	pushq	%rax
	.cfi_def_cfa_offset 32
	.cfi_offset %rbx, -24
	.cfi_offset %rbp, -16
	movq	%rsi, %rbx
	movq	8(%rsi), %rdi
	callq	atoi@PLT
	movl	%eax, %ebp
	movl	%eax, 4(%rsp)
	movq	16(%rbx), %rdi
	callq	atoi@PLT
	movl	%eax, %ebx
	movl	%eax, (%rsp)
	imull	%ebp, %ebx
	leaq	fmt(%rip), %rdi
	movl	%ebx, %esi
	xorl	%eax, %eax
	callq	printf@PLT
	movl	%ebx, %eax
	addq	$8, %rsp
	.cfi_def_cfa_offset 24
	popq	%rbx
	.cfi_def_cfa_offset 16
	popq	%rbp
	.cfi_def_cfa_offset 8
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
	.cfi_endproc

	.type	fmt,@object
	.section	.rodata,"a",@progbits
fmt:
	.asciz	"%d\n"
	.size	fmt, 4

	.section	".note.GNU-stack","",@progbits
