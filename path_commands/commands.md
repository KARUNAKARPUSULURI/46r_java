# Complete CLI & Programming Fundamentals Guide

## Table of Contents
1. [File & Folder Operations](#file--folder-operations)
2. [Navigation Concepts](#navigation-concepts)
3. [Programming Language Types](#programming-language-types)
4. [Execution Models](#execution-models)
5. [Language-Specific Examples](#language-specific-examples)
6. [Quick Reference Summary](#quick-reference-summary)

---

## File & Folder Operations

### 1. Creating Directories

**Command:** `mkdir <foldername>`

**Purpose:** Creates a new directory (folder) in the current location.

**Cross-Platform Usage:**
- **Windows CMD/PowerShell:** `mkdir project_folder`
- **Linux/macOS Terminal:** `mkdir project_folder`

**Examples:**
```bash
mkdir my_projects
mkdir web_development
mkdir "folder with spaces"  # Use quotes for names with spaces
```

**Advanced Usage:**
```bash
mkdir -p parent/child/grandchild  # Creates nested directories (Linux/macOS)
mkdir parent\child\grandchild     # Windows equivalent
```

### 2. Directory Navigation

**Command:** `cd <directory_path>`

**Purpose:** Changes the current working directory.

**Basic Navigation:**
```bash
cd projects           # Move into 'projects' folder
cd /home/user/docs   # Absolute path (Linux/macOS)
cd C:\Users\Name     # Absolute path (Windows)
```

**Special Directory References:**
| Symbol | Meaning | Example |
|--------|---------|---------|
| `.` | Current directory | `cd .` (stays in same place) |
| `..` | Parent directory | `cd ..` (go up one level) |
| `~` | Home directory | `cd ~` (Linux/macOS only) |
| `/` | Root directory | `cd /` (Linux/macOS only) |
| `\` | Drive root | `cd \` (Windows only) |

**Navigation Examples:**
```bash
cd ../images          # Go up one level, then into 'images'
cd ../../documents    # Go up two levels, then into 'documents'
cd ../sibling_folder  # Move to sibling directory
```

### 3. Listing Directory Contents

**Purpose:** Display files and folders in the current directory.

| Shell Type | Command | Options |
|------------|---------|---------|
| Windows CMD | `dir` | `dir /w` (wide format) |
| PowerShell | `ls` or `dir` | `ls -l` (detailed) |
| Linux/macOS | `ls` | `ls -la` (all files + details) |

**Common `ls` Options:**
```bash
ls           # Basic listing
ls -l        # Long format (permissions, size, date)
ls -a        # Show hidden files (starting with .)
ls -la       # Combined: long format + hidden files
ls -lh       # Human-readable file sizes
```

### 4. Clearing the Terminal

**Purpose:** Clear the terminal screen for better visibility.

| Shell Type | Command |
|------------|---------|
| Windows CMD | `cls` |
| PowerShell | `cls` or `clear` |
| Linux/macOS | `clear` |

**Keyboard Shortcut:** `Ctrl + L` (works in most terminals)

### 5. Deleting Directories

**Commands for different scenarios:**

| Task | Windows | Linux/macOS |
|------|---------|-------------|
| Remove empty folder | `rmdir foldername` | `rmdir foldername` |
| Remove folder with contents | `rd /s foldername` | `rm -r foldername` |
| Force delete (dangerous) | `rd /s /q foldername` | `rm -rf foldername` |

**Examples:**
```bash
rmdir empty_folder                    # Remove empty directory
rm -r old_project                     # Remove directory with contents
rm -rf temp_files                     # Force remove (be careful!)
```

**⚠️ Safety Tips:**
- Always double-check the folder name before deleting
- Use `ls` to verify contents before using `-r` flag
- The `-f` flag bypasses confirmations - use with extreme caution

---

## Navigation Concepts

### Breadcrumb Navigation

**Concept:** Shows your current location in the directory hierarchy.

**Example Path:**
```
Windows: C:\Users\karunakar\Documents\projects\web\src
Linux:   /home/karunakar/Documents/projects/web/src
```

**Understanding the Path:**
- Each `\` or `/` represents moving deeper into folders
- You can navigate back to any parent directory
- Current working directory determines where commands execute

**Quick Navigation:**
```bash
pwd                    # Print working directory (show current location)
cd ../../             # Go back two levels
cd /home/user         # Jump directly to specific path
```

### Relative vs Absolute Paths

**Relative Paths:** Start from current directory
```bash
cd documents/projects     # From current location
cd ../images             # Relative to current location
```

**Absolute Paths:** Start from root directory
```bash
cd /home/user/documents  # Linux/macOS full path
cd C:\Users\Name\docs    # Windows full path
```

---


