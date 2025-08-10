# 屿赞工具箱 - Yuzan Toolbox

![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-1.8.2-blue)
![Platforms](https://img.shields.io/badge/Platforms-Windows%20%7C%20macOS%20%7C%20Linux-green)
[![License](https://img.shields.io/badge/License-Apache%202.0-orange)](LICENSE)

屿赞工具箱是一款基于现代 Kotlin 技术的跨平台桌面应用，集成了多种实用工具，帮助您提高工作效率。使用 JetBrains Compose Multiplatform 构建，可在 Windows、macOS 和 Linux 上无缝运行。

## ✨ 功能特点

- **多工具集成**：在一个应用中访问所有常用工具
- **跨平台支持**：Windows、macOS 和 Linux 原生体验
- **现代化界面**：Material You 设计风格，支持深色/浅色主题
- **轻量高效**：低资源占用，快速启动
- **模块化设计**：易于扩展新功能

## 🚀 技术栈

- **Kotlin Multiplatform** - 共享业务逻辑
- **Compose Multiplatform** - 声明式UI框架
- **Kotlin Coroutines** - 异步处理
- **Ktor Client** - 网络请求（更新检查等）
- **SQLDelight** - 本地数据存储
- **MVI 架构** - 状态管理
- **Gradle Kotlin DSL** - 构建系统

## 📦 安装指南

### 下载预编译版本
访问 [Releases 页面](https://github.com/yourusername/yuzan-toolbox/releases) 下载对应平台的安装包：
- Windows: `YuzanToolbox-1.0.0.msi`
- macOS: `YuzanToolbox-1.0.0.dmg`
- Linux: `YuzanToolbox-1.0.0.deb`

### 从源码构建
```bash
# 克隆仓库
git clone https://github.com/yourusername/yuzan-toolbox.git

# 进入项目目录
cd yuzan-toolbox

# 构建项目 (需要JDK 17+)
./gradlew packageReleaseDistribution

# 输出位置: build/compose/binaries
```

## 🛠️ 开发环境

1. 安装 **JDK 17+**
2. 安装最新版 [IntelliJ IDEA](https://www.jetbrains.com/idea/)
3. 安装 Compose Multiplatform 插件：
    - Preferences > Plugins > Marketplace > 搜索 "Compose Multiplatform"
4. 导入项目并同步 Gradle 依赖

### 运行配置
- 选择 `run` 配置
- 选择目标平台：Desktop (JVM)
- 运行 ▶️

## 🧩 项目结构
```
yuzan-toolbox/
├── build.gradle.kts     # 主构建脚本
├── settings.gradle.kts
├── gradle.properties
├── README.md            # 本文档
├── LICENSE
└── src/
    ├── commonMain/      # 共享代码
    │   ├── kotlin/
    │   │   ├── features/  # 功能模块
    │   │   ├── di/        # 依赖注入
    │   │   └── YuzanApp.kt # 主入口
    │   └── resources/
    ├── desktopMain/     # 桌面平台特定代码
    │   ├── kotlin/
    │   └── resources/
    └── androidMain/     # (可选) Android支持
```

## 🤝 贡献指南

欢迎贡献代码！请遵循以下流程：
1. Fork 本项目
2. 创建新分支 (`git checkout -b feature/your-feature`)
3. 提交修改 (`git commit -am 'Add some feature'`)
4. 推送分支 (`git push origin feature/your-feature`)
5. 创建 Pull Request

请确保：
- 遵循现有代码风格
- 添加必要的单元测试
- 更新相关文档

## 📄 许可证

本项目采用 [Apache License 2.0](LICENSE) 开源协议

```
Copyright 2025 屿你有关

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

---
💡 灵感来自日常工作效率工具需求 | 🏠 主页: [https://github.com/978814197/Yuzan](https://github.com/978814197/Yuzan) | 📧 联系: ljj978814197@gmail.com