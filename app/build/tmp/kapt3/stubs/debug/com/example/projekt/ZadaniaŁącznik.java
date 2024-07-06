package com.example.projekt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/projekt/Zadania\u0141\u0105cznik;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/projekt/Zadania\u0141\u0105cznik$Widok;", "todos", "", "Lcom/example/projekt/Zadania;", "(Ljava/util/List;)V", "dodajZadanie", "", "todo", "getItemCount", "", "getTasks", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleStrikeThrough", "tvTodoTitle", "Landroid/widget/TextView;", "isChecked", "", "usunZadanie", "Widok", "app_debug"})
public final class ZadaniaŁącznik extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.projekt.ZadaniaŁącznik.Widok> {
    private final java.util.List<com.example.projekt.Zadania> todos = null;
    
    public ZadaniaŁącznik(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.projekt.Zadania> todos) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.projekt.ZadaniaŁącznik.Widok onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void dodajZadanie(@org.jetbrains.annotations.NotNull
    com.example.projekt.Zadania todo) {
    }
    
    public final void usunZadanie() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.projekt.Zadania> getTasks() {
        return null;
    }
    
    private final void toggleStrikeThrough(android.widget.TextView tvTodoTitle, boolean isChecked) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.projekt.ZadaniaŁącznik.Widok holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/projekt/Zadania\u0141\u0105cznik$Widok;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/projekt/databinding/ItemzadanieBinding;", "(Lcom/example/projekt/databinding/ItemzadanieBinding;)V", "app_debug"})
    public static final class Widok extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.projekt.databinding.ItemzadanieBinding binding = null;
        
        public Widok(@org.jetbrains.annotations.NotNull
        com.example.projekt.databinding.ItemzadanieBinding binding) {
            super(null);
        }
    }
}