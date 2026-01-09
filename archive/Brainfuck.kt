fun brainfuck(code: String): String {
    val mem = ByteArray(30000)
    var ptr = 0
    var pc = 0
    val out = StringBuilder()
    val stack = mutableListOf<Int>()
    val jump = mutableMapOf<Int, Int>()
    
    // 预处理括号匹配
    code.forEachIndexed { i, c ->
        when (c) {
            '[' -> stack += i
            ']' -> {
                val s = stack.removeAt(stack.size - 1)
                jump[s] = i
                jump[i] = s
            }
        }
    }
    
    while (pc < code.length) {
        when (code[pc]) {
            '>' -> ptr++
            '<' -> ptr--
            '+' -> mem[ptr]++
            '-' -> mem[ptr]--
            '.' -> out.append(mem[ptr].toInt().toChar())
            '[' -> if (mem[ptr].toInt() == 0) pc = jump[pc]!!
            ']' -> if (mem[ptr].toInt() != 0) pc = jump[pc]!!
        }
        pc++
    }
    
    return out.toString()
}

fun main() {
    // 测试
    println(brainfuck("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++."))
    // 输出: Hello World!
}