## Programming Language Types

### Interpreted Languages

**Characteristics:**
- Execute code line by line
- No separate compilation step
- Slower runtime performance
- Faster development cycle
- Errors discovered during execution

**Examples:** Python, JavaScript, Ruby, PHP

**Execution Flow:**
```
Source Code → Interpreter → Direct Execution
```

**Advantages:**
- Quick to test and run
- Interactive development possible
- Platform independent (if interpreter available)
- Easy debugging and modification

**Disadvantages:**
- Slower execution speed
- Requires interpreter on target machine
- Source code is exposed

### Compiled Languages

**Characteristics:**
- Entire code converted to machine code before execution
- Separate compilation step required
- Faster runtime performance
- Slower development cycle
- Errors caught during compilation

**Examples:** C, C++, Go, Rust

**Execution Flow:**
```
Source Code → Compiler → Machine Code → Execution
```

**Advantages:**
- Faster execution speed
- No need for runtime environment on target machine
- Source code protection
- Early error detection

**Disadvantages:**
- Longer build times
- Platform-specific binaries
- Less flexible during development

### Hybrid Languages

**Characteristics:**
- Combine compilation and interpretation
- Compile to intermediate code (bytecode)
- Bytecode is interpreted or JIT compiled

**Examples:** Java, C#, Python (partially)

---

## Execution Models

### Single-Threading

**Concept:** Executes one instruction at a time in sequence.

**Characteristics:**
- Simple to understand and debug
- Predictable execution order
- May not utilize full CPU potential
- Common in interpreted languages

**Example Flow:**
```
Line 1 → Execute → Complete
Line 2 → Execute → Complete
Line 3 → Execute → Complete
```

### Multi-Threading

**Concept:** Multiple threads of execution run concurrently.

**Characteristics:**
- Better CPU utilization
- Complex synchronization requirements
- Potential for race conditions
- Common in compiled and hybrid languages

**Example Flow:**
```
Thread 1: Task A → Task B → Task C
Thread 2: Task X → Task Y → Task Z
         (Running simultaneously)
```

**Benefits:**
- Improved performance for I/O operations
- Better user experience in applications
- Efficient resource utilization

**Challenges:**
- Thread synchronization
- Deadlock prevention
- Debugging complexity

---

## Language-Specific Examples

### Java (Hybrid Language)

**Two-Phase Execution:**

**Phase 1: Compilation**
```bash
javac MyProgram.java    # Compiles to MyProgram.class
```

**Phase 2: Execution**
```bash
java MyProgram          # Runs bytecode on JVM
```

**Complete Flow:**
```
Source Code (.java)
       ↓
Compiler (javac)
       ↓
Bytecode (.class)
       ↓
JVM (Java Virtual Machine)
       ↓
Native Machine Code
       ↓
Execution
```

**Key Components:**
- **JDK (Java Development Kit):** Contains compiler and tools
- **JRE (Java Runtime Environment):** Contains JVM for execution
- **JVM (Java Virtual Machine):** Executes bytecode

**Advantages of Java's Approach:**
- Write once, run anywhere (WORA)
- Platform independence through JVM
- Optimized execution through JIT compilation
- Strong memory management

### JavaScript (Interpreted)

**Execution Environment:**
- **Browser:** V8 Engine (Chrome), SpiderMonkey (Firefox)
- **Server:** Node.js runtime

**Execution Flow:**
```
Source Code → JavaScript Engine → Direct Execution
```

**Characteristics:**
- No compilation step required
- Dynamic typing
- Event-driven programming
- Asynchronous execution capabilities

**Modern JavaScript:**
- **JIT Compilation:** Modern engines compile frequently used code
- **Optimization:** Runtime optimizations improve performance
- **ES Modules:** Modern module system for better organization

### C Language (Compiled)

**Compilation Process:**
```bash
gcc program.c -o program    # Compile to executable
./program                   # Run the executable
```

**Compilation Steps:**
```
Source Code (.c)
       ↓
Preprocessor (handles #include, #define)
       ↓
Compiler (generates assembly)
       ↓
Assembler (creates object code)
       ↓
Linker (combines libraries)
       ↓
Executable Binary
```

**Characteristics:**
- Direct compilation to machine code
- No runtime dependencies
- Maximum performance
- Manual memory management

---

## Quick Reference Summary

### Essential Commands

| Operation | Windows | Linux/macOS |
|-----------|---------|-------------|
| Create folder | `mkdir name` | `mkdir name` |
| Change directory | `cd path` | `cd path` |
| List contents | `dir` | `ls` |
| Go up one level | `cd ..` | `cd ..` |
| Show current path | `cd` | `pwd` |
| Clear screen | `cls` | `clear` |
| Remove empty folder | `rmdir name` | `rmdir name` |
| Remove folder + contents | `rd /s name` | `rm -r name` |

### Language Classification

| Language | Type | Execution Model |
|----------|------|-----------------|
| Python | Interpreted | Line-by-line |
| JavaScript | Interpreted | Line-by-line (+ JIT) |
| Java | Hybrid | Compile to bytecode, then interpret |
| C# | Hybrid | Compile to IL, then JIT |
| C | Compiled | Direct to machine code |
| C++ | Compiled | Direct to machine code |
| Go | Compiled | Direct to machine code |
| Ruby | Interpreted | Line-by-line |
| PHP | Interpreted | Line-by-line |

### Development Workflow

**Interpreted Languages:**
```
Write Code → Run Directly → Debug → Repeat
```

**Compiled Languages:**
```
Write Code → Compile → Run → Debug → Repeat
```

**Hybrid Languages:**
```
Write Code → Compile to Intermediate → Run on VM → Debug → Repeat
```

### Best Practices

**Command Line:**
- Always verify your current directory with `pwd` or `cd`
- Use tab completion to avoid typos
- Be cautious with delete commands
- Keep backups of important directories

**Programming:**
- Choose the right language for your use case
- Understand the execution model of your chosen language
- Consider performance requirements when selecting compiled vs interpreted
- Use version control systems for code management