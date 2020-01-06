package dev.blachut.svelte.lang.parsing.html.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.javascript.psi.JSElement
import dev.blachut.svelte.lang.psi.SveltePsiElementImpl
import dev.blachut.svelte.lang.psi.SvelteTag

sealed class SvelteBranch(node: ASTNode) : SveltePsiElementImpl(node), JSElement {
    val tag: SvelteTag get() = firstChild as SvelteTag
}

abstract class SveltePrimaryBranch(node: ASTNode) : SvelteBranch(node)

abstract class SvelteAuxiliaryBranch(node: ASTNode) : SvelteBranch(node)
