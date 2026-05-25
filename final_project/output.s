	.file	"<string>"
	.text
	.globl	main
	.p2align	4
	.type	main,@function
main:
	.cfi_startproc
	pushq	%rbx
	.cfi_def_cfa_offset 16
	.cfi_offset %rbx, -16
	leaq	fmt_header(%rip), %rdi
	xorl	%eax, %eax
	callq	printf@PLT
	leaq	fmt_row(%rip), %rbx
	leaq	name_A(%rip), %rdx
	movq	%rbx, %rdi
	movl	$1, %esi
	movl	$3, %ecx
	xorl	%r8d, %r8d
	xorl	%r9d, %r9d
	xorl	%eax, %eax
	callq	printf@PLT
	leaq	name_D(%rip), %rdx
	movq	%rbx, %rdi
	movl	$2, %esi
	movl	$6, %ecx
	xorl	%r8d, %r8d
	xorl	%r9d, %r9d
	xorl	%eax, %eax
	callq	printf@PLT
	leaq	name_B(%rip), %rdx
	movq	%rbx, %rdi
	movl	$3, %esi
	movl	$8, %ecx
	movl	$2, %r8d
	movl	$20, %r9d
	xorl	%eax, %eax
	callq	printf@PLT
	leaq	name_C(%rip), %rdx
	movq	%rbx, %rdi
	movl	$4, %esi
	movl	$13, %ecx
	movl	$4, %r8d
	movl	$100, %r9d
	xorl	%eax, %eax
	callq	printf@PLT
	leaq	fmt_total(%rip), %rdi
	movl	$120, %esi
	xorl	%eax, %eax
	callq	printf@PLT
	xorl	%eax, %eax
	popq	%rbx
	.cfi_def_cfa_offset 8
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
	.cfi_endproc

	.type	fmt_header,@object
	.section	.rodata,"a",@progbits
	.p2align	4, 0x0
fmt_header:
	.asciz	"Secuencia optima de ordenes:\n"
	.size	fmt_header, 30

	.type	fmt_row,@object
	.p2align	4, 0x0
fmt_row:
	.asciz	"Paso %d: Orden %s | finish=%d | late=%d | penalty=%d\n"
	.size	fmt_row, 54

	.type	name_A,@object
name_A:
	.asciz	"A"
	.size	name_A, 2

	.type	name_D,@object
name_D:
	.asciz	"D"
	.size	name_D, 2

	.type	name_B,@object
name_B:
	.asciz	"B"
	.size	name_B, 2

	.type	name_C,@object
name_C:
	.asciz	"C"
	.size	name_C, 2

	.type	fmt_total,@object
	.p2align	4, 0x0
fmt_total:
	.asciz	"\nPenalizacion total: %d\n"
	.size	fmt_total, 25

	.section	".note.GNU-stack","",@progbits
